package com.xworkz.terrorist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class TerroristDTO extends AbstractAuditDTO {
	@NonNull
	@NotNull(message = "Terrorist name cannot be null")
	@Size(min = 3, max = 20, message = "Name is invalid, should be more than 3")
	private String Name;
	@NonNull
	@Min(value = 1, message = "Age should be greater than 1 or less than 150")
	@Max(value = 150, message="Age should be greater than 1 or less than 150")
	private int age;
	@NonNull
	@NotNull(message = "Terrorist country cannot be null")
	@Size(min = 3, max = 20, message = "country is invalid, should be more than 3")
	private String country;
	private boolean alive;
	private boolean prison;
	@NonNull
	@NotNull(message = "Terrorist specialization cannot be null")
	@Size(min = 3, max = 20, message = "specialization is invalid, should be more than 3")
	private String specialization;
	@NonNull
	@NotNull(message = "Terrorist organization cannot be null")
	@Size(min = 3, max = 20, message = "organization is invalid, should be more than 3")
	private String organization;

}
