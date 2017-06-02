/*
 * Copyright 2017 Huawei Technologies Co., Ltd
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

package io.servicecomb.codec.protobuf.jackson;

import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @version  [版本号, 2016年12月6日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class StandardObjectWriter extends ObjectWriter {
    private static final long serialVersionUID = -8162644250351645123L;

    /**
     * <构造函数> [参数说明]
     */
    public StandardObjectWriter(ObjectWriter base) {
        super(base, base.getConfig());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void writeValue(OutputStream out,
            Object value) throws IOException, JsonGenerationException, JsonMappingException {
        Object[] values = (Object[]) value;
        super.writeValue(out, values[0]);
    }
}