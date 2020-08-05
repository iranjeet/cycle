package com.cycle.list.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.cycle.list.domain.Brands;
import com.cycle.list.dto.requestDto.AddBrands;

@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN)
public interface BrandMapper {
	
	
	@Mapping(target = "updateBy",source = "updatedBy")
	@Mapping(target ="type_note",source="typeNote")
	@Mapping(target = "discription",source = "description")
	@Mapping(target = "founded_by",source="foundedBy")
	@Mapping(target = "founded_date",source = "foundedDate")
//	@Mapping(target = "Key_people",source="key_People")
	@Mapping(target="official_website",source = "websiteUrl")
	@Mapping(target = "official_email", source = "email")
	AddBrands domainToDTO(Brands brands);
}
