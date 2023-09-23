package com.example.config;

public class SecondBeanConfiguration {
    private String value;

    private ThirdBeanConfiguration thirdBean;

    public ThirdBeanConfiguration getThirdBean() {
        return thirdBean;
    }

    public void setThirdBean(ThirdBeanConfiguration thirdBean) {
        this.thirdBean = thirdBean;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
