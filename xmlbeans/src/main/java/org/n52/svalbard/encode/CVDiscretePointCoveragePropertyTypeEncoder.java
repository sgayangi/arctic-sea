/*
 * Copyright 2016-2018 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.svalbard.encode;

import java.util.Collections;
import java.util.Set;

import org.n52.shetland.ogc.cv.CvConstants;
import org.n52.shetland.ogc.om.values.CvDiscretePointCoverage;
import org.n52.svalbard.encode.exception.EncodingException;

import com.google.common.collect.Sets;

import net.opengis.cv.x02.gml32.CVDiscretePointCoveragePropertyType;

/**
 * {@link Encoder} for {@link CvDiscretePointCoverage} to encode to
 * {@link CVDiscretePointCoveragePropertyType}
 *
 * @author <a href="mailto:c.hollmann@52north.org">Carsten Hollmann</a>
 * @since 1.0.0
 *
 */
public class CVDiscretePointCoveragePropertyTypeEncoder
        extends AbstractCVDiscretePointCoverageTypeEncoder<CVDiscretePointCoveragePropertyType> {

    private static final Set<EncoderKey> ENCODER_KEYS = Sets.newHashSet(
            new ClassToClassEncoderKey(CvDiscretePointCoverage.class, CVDiscretePointCoveragePropertyType.class),
            new XmlPropertyTypeEncoderKey(CvConstants.NS_CV, CvDiscretePointCoverage.class));

    @Override
    public Set<EncoderKey> getKeys() {
        return Collections.unmodifiableSet(ENCODER_KEYS);
    }

    @Override
    public CVDiscretePointCoveragePropertyType encode(CvDiscretePointCoverage cvDiscretePointCoverage)
            throws EncodingException {
        return encode(cvDiscretePointCoverage, EncodingContext.empty());
    }

    @Override
    public CVDiscretePointCoveragePropertyType encode(CvDiscretePointCoverage cvDiscretePointCoverage,
            EncodingContext ec) throws EncodingException {
        // spatialObservation + measured value
        CVDiscretePointCoveragePropertyType cvdpcpt =
                CVDiscretePointCoveragePropertyType.Factory.newInstance(getXmlOptions());
        cvdpcpt.setCVDiscretePointCoverage(encodeCVDiscretePointCoverage(cvDiscretePointCoverage));
        return cvdpcpt;
    }

}
