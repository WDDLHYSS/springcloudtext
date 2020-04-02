//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.alibaba.cloud.sentinel.feign;

import feign.Contract;
import feign.MethodMetadata;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentinelContractHolder implements Contract {
    private final Contract delegate;
    public static final Map<String, MethodMetadata> METADATA_MAP = new HashMap();

    public SentinelContractHolder(Contract delegate) {
        this.delegate = delegate;
    }

    public List<MethodMetadata> parseAndValidatateMetadata(Class<?> targetType) {
        List<MethodMetadata> metadatas = this.delegate.parseAndValidateMetadata(targetType);
        metadatas.forEach((metadata) -> {
            MethodMetadata var10000 = (MethodMetadata)METADATA_MAP.put(targetType.getName() + metadata.configKey(), metadata);
        });
        return metadatas;
    }

    /**
     *
     * @param aClass
     * @return
     * springclou.sr3需要重写parseAndValidateMetadata方法（名字不同报错SentinelContractHolder.parseAndValidateMetadata(Ljava/lang/Class;)）
     */
    @Override
    public List<MethodMetadata> parseAndValidateMetadata(Class<?> aClass) {
        List<MethodMetadata> metadatas = delegate.parseAndValidateMetadata(aClass);
        metadatas.forEach(metadata -> METADATA_MAP
                .put(aClass.getName() + metadata.configKey(), metadata));
        return metadatas;

    }
}
