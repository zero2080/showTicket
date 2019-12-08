package com.spring.board.service;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.spring.board.model.Advertising;
import com.spring.board.util.URLMaker;

public class AdvertServiceImpl implements AdvertService {

	@Override
	public boolean uploadShow(MultipartHttpServletRequest mRequest, Advertising advert) {
		// TODO Auto-generated method stub
		//이미지 업로드 처리
		String uploadPath = mRequest.getRealPath("img/");
		String backupPath = mRequest.getRealPath("img_backup/");
		
		Iterator<String> params = mRequest.getFileNames();
		StringBuffer mimg = new StringBuffer();//main_img_contents
		StringBuffer simg = new StringBuffer();//sub_img_contents
		
		
		while(params.hasNext()) {
			String param = params.next();
			
			MultipartFile mFile = mRequest.getFile(param);
			mimg.append(mFile.getOriginalFilename());
			String imgLink = URLMaker.imgLinkMaker(mRequest.getRequestURL(), mimg.toString());
			if(mimg!=null && !mimg.toString().equals("")) {
				if(new File(uploadPath+mimg.toString()).exists()) {
					mimg.insert(0,System.currentTimeMillis());
				}
				try {
					mFile.transferTo(new File(uploadPath+mimg.toString()));
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			if(param.equals("mainImg")) {
				advert.setMain_img_contents(imgLink);
			}else if(param.equals("subimg")){
				advert.setSub_img_contents(imgLink);
			}
			
			/* 반복문으로 
			 * main_img_contents와 
			 * sub_img_contents에 
			 * <br>로 구분해서 
			 * StringBuffer 만들어야함
			 * 
			 * 문제점 1
			 *   main이미지와 sub이미지를 구분하는 기준??
			 *   ㄴ 뷰단에서 기준을 정해야함
			 * 
			 * 문제점 2
			 *   한 컬럼에 이미지 URL과 텍스트를 <br>로 구분한다고하는데
			 *   그렇다면 이미지 링크만 뽑하내는 방법은??
			 *    ㄴ 해결"'http://'로 시작하고 <br>로 끝나는 부분까지 잘라서 쓰면됨
			 *    
			 * 만약 "main이미지+텍스트"와 "sub이미지+텍스트"를 
			 * 하나의 텍스트편집기에서 처리하고자 한다면 한단계 복잡한 구조를 짜야함
			 * 그리고 하나의 텍스트편집이를 두개의 컬럼에 나눠담고
			 * 나중에 쓸때는 따로 보인다면 하나의 편집기를 쓸 이유가 없는것이고
			 * 나중에 같이 쓴다면 컬럼을 두개를 쓸 이유가 없는것이다.
			 * 그래서 이부분은 오너가 정립을 해주어야 한다.
			 *  결론 : 할 수는 있지만 의미가 없다.
			 */
			
		}
		
		return false;
	}

	@Override
	public List<Advertising> myShowList(String acnt_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
