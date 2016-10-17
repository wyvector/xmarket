package me.jcala.xmarket.data.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 分类列表封装类
 */
@Setter
@Getter
public class SortTag {
    private String id;//分类的id
    private String name;//分类的名称
    private String bgPic;//分类的背景图片
}
