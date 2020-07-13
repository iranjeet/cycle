package com.cycle.list.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.cycle.list.domain.Cycle;
import com.cycle.list.dto.requestDto.RequestCycleDTO;
@Mapper
public interface CycleMapper {

	CycleMapper INSTANCE=Mappers.getMapper(CycleMapper.class);
	
	RequestCycleDTO cycleToCycleDto(Cycle cycle);
	
	
}
