package com.springStudy.annotation;

@Desc("北京我爱你")
public class son  implements  father {

    @Override
    @Desc("湘潭我爱你")
    public String name() {
        return null;
    }

    @Override
    @Desc("今年18岁")
    public int age() {
        return 0;
    }
}
