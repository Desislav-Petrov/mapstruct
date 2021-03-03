/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.conversion.java8time.localdatetimetoxmlgregoriancalendarconversion;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author Andrei Arlou
 */
@Mapper
public interface SourceTargetMapper {

    SourceTargetMapper INSTANCE = Mappers.getMapper( SourceTargetMapper.class );

    @Mapping(target = "localDateTime", source = "xmlGregorianCalendar")
    Target toTarget(Source source);

    @Mapping(target = "xmlGregorianCalendar", source = "localDateTime")
    Source toSource(Target target);
}
