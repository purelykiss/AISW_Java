package kr.ac.kopo.main;

import java.util.HashMap;
import java.util.Map;

public class TooltipSystem {
    // 툴팁 템플릿
    private static final String TOOLTIP_TEMPLATE = "이 챔피언은 {name}을 사용하여 {ability}을(를) 발동합니다.";

    // 변수를 템플릿에 삽입하는 메서드
    private static String insertVariables(String tooltipTemplate, Map<String, String> variables) {
        String tooltipText = tooltipTemplate;
        for (Map.Entry<String, String> entry : variables.entrySet()) {
            String variable = "{" + entry.getKey() + "}";
            String value = entry.getValue();
            tooltipText = tooltipText.replace(variable, value);
        }
        return tooltipText;
    }

    public static void main(String[] args) {
        // 변수 맵 생성
        Map<String, String> variables = new HashMap<>();
        variables.put("name", "피즈");
        variables.put("ability", "Q 스킬");

        // 변수를 삽입한 툴팁 텍스트 생성
        String tooltipText = insertVariables(TOOLTIP_TEMPLATE, variables);

        // 결과 출력
        System.out.println(tooltipText);
    }
}