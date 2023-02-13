package com.xworkz.egg.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CmDTO {
	@NotNull(message ="cm name cannot be null or black")
	@Size(min=3,max=20,message="cm name should be more than 3 and less than 20 char")
	private String name;
	@NotBlank(message="party cannot be null")
	private String party;
	@NotBlank(message="state cannot be null")
	private String state;
	@NotNull(message="tenure cannot be null")
	@Min(value =1, message="tenure cannot be less than zero")
	private Integer tenure;
	@NotBlank(message="portfolio cannot be null")
	private String portfolio;
}
