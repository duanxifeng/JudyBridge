package com.zly.judy.plugin
/**
 * 配置参数
 * Created by Zhuliya on 2018/8/10
 */
class ConfigExtension {

    /**
     * 模块文件的后缀名规则，用于遍历文件时判断并快速过滤不需要解析文件，可以提升构建速度
     * 例如：XXXJudyModule
     */
    String parseFileSuffix = null

    /**
     * 生成中间层接口文件的后缀名,默认值："Bridge"，生成后的中间层接口文件名为："XXXBridge.java"
     */
    String proxyFileSuffix = "Bridge"

    /**
     * 生成中间层接口文件的包路径(例如 com.zly.judy)，目前配置后无效，代码中会覆盖
     */
    String packageName = ""

    /**
     * 是否输出debug日志信息，默认：false,不输出
     */
    boolean logDebug

}