package com.spring.board.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.spring.board.dao.AdvertDao;
import com.spring.board.model.Advertising;
import com.spring.board.util.URLMaker;

@Service
public class AdvertServiceImpl implements AdvertService {
	@Autowired
	private AdvertDao aDao;
	
	@Override
	public boolean uploadShow(MultipartHttpServletRequest mRequest, Advertising advert) {
		// TODO Auto-generated method stub
		//이미지 업로드 처리
		String uploadPath = mRequest.getRealPath("/img/")+"\\";
		String backupPath = mRequest.getRealPath("/img_backup/")+"\\";
		
		Iterator<String> params = mRequest.getFileNames();
		StringBuffer mimg = new StringBuffer();//main_img
		
		while(params.hasNext()) {
			String param = params.next();
			
			MultipartFile mFile = mRequest.getFile(param);
			if(mimg.length()>0) {
				mimg.setLength(0);
			}
			mimg.append(mFile.getOriginalFilename());
			String imgLink = URLMaker.imgLinkMaker(mRequest.getRequestURL(), mimg.toString());
			if(!mimg.toString().equals("")) {
				if(new File(uploadPath+mimg.toString()).exists()) {
					mimg.insert(0,System.currentTimeMillis());
				}
				try {
					mFile.transferTo(new File(uploadPath+mimg.toString()));
					filecopy(uploadPath+mimg.toString(),backupPath+mimg.toString());
				}catch(Exception e) {
					e.printStackTrace();
				}
				if(param.equals("mainImg")) {
					advert.setMain_img(imgLink);
				}else if(param.equals("subImg")){
					advert.setSub_img(imgLink);
				}else if(param.equals("detImg")){
					advert.setDetail_img(imgLink);
				}else {
					advert.setDocument(imgLink);
				}
			}
			
		}
		boolean result = aDao.uploadShow(advert);
		return result;
	}
	
	private int filecopy(String serverFile, String backupFile) {
		int isCopy = 0;
		FileInputStream is = null;
		FileOutputStream os = null;
		try {
			is= new FileInputStream(serverFile);
			os = new FileOutputStream(backupFile);
			File sFile = new File(serverFile);
			byte[] buff = new byte[(int)sFile.length()];
			while(true) {
				int nRead = is.read(buff);
				if(nRead == -1) {
					break;
				}
				os.write(buff,0,nRead);
			}
			isCopy=1;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(is!=null){
					is.close();
				}
				if(os!=null) {
					os.close();
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return isCopy;
	}
	
	
	@Override
	public List<Advertising> myShowList(String acnt_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
