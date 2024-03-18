package com.template.project.test.convertor;

import com.template.project.dataobject.TestTableDO;
import dto.test.TestTableDTO;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TestConvertor {

    TestConvertor INSTANCE = Mappers.getMapper(TestConvertor.class);

    @Named("toTestTableDTO")
    TestTableDTO toTestTableDTO(TestTableDO testTableDO);

    @IterableMapping(qualifiedByName = "toTestTableDTO")
    List<TestTableDTO> toTestTableDTOList(List<TestTableDO> testTableDOS);

}
