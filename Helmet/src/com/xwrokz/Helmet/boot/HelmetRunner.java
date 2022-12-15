package com.xwrokz.Helmet.boot;

import com.xwrokz.Helmet.constant.Color;
import com.xwrokz.Helmet.constant.HelmetType;
import com.xwrokz.Helmet.dto.HelmetDTO;
import com.xwrokz.Helmet.repository.HelmetRepository;
import com.xwrokz.Helmet.repository.HelmetRepositoryImpl;
import com.xwrokz.Helmet.service.HelmetService;
import com.xwrokz.Helmet.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		
		HelmetDTO dto=new HelmetDTO("Vega", HelmetType.HALF, new Double(750), Color.BLACK );
		
		HelmetRepository repository=new HelmetRepositoryImpl();
		
		HelmetService helmetService=new HelmetServiceImpl(repository);
		
		boolean success=helmetService.validateAndSave(dto);
		System.out.println("success "+success);

	}

}
