package com.template.project.test.convertor;

import com.template.project.test.response.TestTableResponse;
import dto.test.TestTableDTO;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TestResponseConvertor {

    TestResponseConvertor INSTANCE = Mappers.getMapper(TestResponseConvertor.class);

    @Named("toTestTableResponse")
    TestTableResponse toTestTableResponse(TestTableDTO testTableDTO);

    @IterableMapping(qualifiedByName = "toTestTableResponse")
    List<TestTableResponse> toTestTableResponseList(List<TestTableDTO> testTableDTOS);

}
