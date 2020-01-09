package com.softeem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * JSON（JavaScript Object N...）
 *
 * int i = 10;              10，     整型字面量
 * double d = 1.234         1.234，  双精度浮点型字面量
 * String str = "hello"     "hello"，字符串字面量
 * char c = 'x'             'x'，    字符字面量
 *
 * JS 中提出了【对象字面量】，形如 { "xxx":..., "yyy":..., "zzz": ... }
 * JS 之后诞生的编程语言，基本上都有【对象字面量】的概念。
 * Student tom = {
 *     "name": "tom",
 *     "age": 20,
 *     "phone": "192xxxxxxxx"
 * };
 *
 * 其他编程语言（包括Java），认为这是个 good ideal，
 * 不过，它们没有在自己的用法中直接加入【对象字面量】的概念，而是采用了一个【间接方案】：
 *
 * 如果一个字符串的内容符合 JS 的对象字面量的语法规则，那么称这个字符串为 JSON 格式字符串，简称 JSON 。
 * 然后，再提供官方的/非官方的/第三方的库/工具，来实现 JSON 格式字符串和对象之间的互转。
 *
 * 国外：jackson（spring默认使用的）、gson（google）
 * 国内：fastjson（ali）
 *
 * JSON 可以嵌套：
 *
 * {
 *      "id" :  9527
 *      "name": "tom",
 *      "age" : 18,
 *      "phone": "192xxxxxxxx",
 *      "teacher" : {
 *          "id" : 10,
 *          "name": "张三",
 *          "phone": "198xxxxxxxx"
 *      }
 * };
 *
 *
 * {
 *      "id" : 10,
 *      "name" : "张三",
 *      "phone" : "198xxxxxxxx",
 *      "students" : [ {...}, {...}, {...} ]
 * }
 *
 *
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
