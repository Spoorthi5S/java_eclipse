package com.xwrokz.Helmet.service;

import com.xwrokz.Helmet.constant.Color;
import com.xwrokz.Helmet.constant.HelmetType;
import com.xwrokz.Helmet.dto.HelmetDTO;
import com.xwrokz.Helmet.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {
	
	private HelmetRepository helmetRepository;
	
	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository=helmetRepository;
	}

	@Override
	public boolean validateAndSave(HelmetDTO dto) {
		String brand = dto.getBrand();
		HelmetType type=dto.getType();
		double price=dto.getPrice();
		Color color=dto.getColor();
		boolean validBrand=false;
		boolean validType=false;
		boolean validPrice=false;
		boolean validColor=false;
		
		if(brand!=null && brand.length()>=4 && brand.length()<=10)
		{
			System.out.println("Brand is valid");
			validBrand=true;
		}else
		{
			System.err.println("Brand is invalid");
		}
		if(type!=null) {
			System.out.println("Type is valid");
			validType=true;
		}else {
			System.err.println("Type is invalid");
		}
		if(color!=null) {
			System.out.println("color is valid");
			validColor=true;
		}else {
			System.err.println("color is invalid");
		}
		if(price>100 && price<10000) {
			System.out.println("price is valid");
			validPrice=true;
		}else {
			System.err.println("price is invalid");
		}
		if(validBrand && validPrice && validColor && validType)
		{
			System.out.println("HelmetDTO is valid, can save using repository");
			boolean saved=this.helmetRepository.save(dto);
			System.out.println("Helmet DTO is saved "+saved);
			return saved;
		}else {
			System.out.println("HelmetDTO is invalid, cannot save using rpository");
		}
		return false;
	}

}
