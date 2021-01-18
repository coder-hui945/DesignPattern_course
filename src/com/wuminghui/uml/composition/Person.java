package com.wuminghui.uml.composition;

import com.wuminghui.uml.dependence.IDCard;

public class Person {
    private IDCard card; //聚合关系
    private Head head = new Head(); //组合关系

}
