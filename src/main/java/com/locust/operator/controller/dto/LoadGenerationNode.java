package com.locust.operator.controller.dto;

import com.locust.operator.customresource.internaldto.LocustTestAffinity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.NONE)
public class LoadGenerationNode {

    private String name;
    private Map<String, String> labels;
    private Map<String, String> annotations;
    private LocustTestAffinity affinity;
    private List<String> command;
    private OperationalMode operationalMode;
    private String image;
    private Integer replicas;
    private List<Integer> ports;
    private String configMap;

}
