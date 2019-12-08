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

import com.spring.board.dao.MemDao;
import com.spring.board.model.Member;
import com.spring.board.util.URLMaker;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemDao mDao;
	@Override
	public List<Member> memberList(){
		return mDao.memberList();
	}
	@Override
	public Member getMember(String acnt_id) {
		return mDao.getMember(acnt_id);
	}
	@Override
	public boolean joinCom(MultipartHttpServletRequest mRequest, Member member) {
		//파일 저장
		String uploadPath = mRequest.getRealPath("img/");
		String backupPath = mRequest.getRealPath("img_back/");
		
		Iterator<String> params = mRequest.getFileNames();
		
		String mimg = "noimage.png";
		
		while(params.hasNext()) {
			String param = params.next();
			
			MultipartFile mFile = mRequest.getFile(param);
			mimg = mFile.getOriginalFilename();
			String imgLink = URLMaker.imgLinkMaker(mRequest.getRequestURL(),mimg);
			if(mimg!=null && !mimg.equals("")) {
				if(new File(uploadPath+mimg).exists()) {
					mimg = System.currentTimeMillis()+"_"+mimg;
				}
				try {
					mFile.transferTo(new File(uploadPath+mimg));
					System.out.println("serverFile : " + uploadPath+mimg);
					System.out.println("backupFile : " + backupPath+mimg);
					filecopy(uploadPath+mimg,backupPath+mimg);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			if(param.equals("biz_reg")) {
				member.setBusiness_reg(imgLink);
			}else {
				member.setDocument(imgLink);
			}
		}
		
		boolean result = mDao.joinCom(member);
		System.out.println(result?"Join Success":"Join Fail");
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
	
}
