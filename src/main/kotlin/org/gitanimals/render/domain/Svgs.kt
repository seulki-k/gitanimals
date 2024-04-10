package org.gitanimals.render.domain

import org.springframework.core.io.ClassPathResource
import java.nio.charset.Charset

val whiteFieldSvg: String = ClassPathResource("persona/field/white-field.svg")
    .getContentAsString(Charset.defaultCharset())

val snowyFieldSvg: String = ClassPathResource("persona/field/snowy-field.svg")
    .getContentAsString(Charset.defaultCharset())

val gooseSvg: String = ClassPathResource("persona/animal/goose.svg")
    .getContentAsString(Charset.defaultCharset())

val gooseKotlinSvg: String = ClassPathResource("persona/animal/goose-kotlin.svg")
    .getContentAsString(Charset.defaultCharset())

val gooseJavaSvg: String = ClassPathResource("persona/animal/goose-java.svg")
    .getContentAsString(Charset.defaultCharset())

val gooseJsSvg: String = ClassPathResource("persona/animal/goose-js.svg")
    .getContentAsString(Charset.defaultCharset())

val gooseNodeSvg: String = ClassPathResource("persona/animal/goose-node.svg")
    .getContentAsString(Charset.defaultCharset())

val gooseSwiftSvg: String = ClassPathResource("persona/animal/goose-swift.svg")
    .getContentAsString(Charset.defaultCharset())

val gooseLinuxSvg: String = ClassPathResource("persona/animal/goose-linux.svg")
    .getContentAsString(Charset.defaultCharset())

val gooseSpringSvg: String = ClassPathResource("persona/animal/goose-spring.svg")
    .getContentAsString(Charset.defaultCharset())

val littleChickSvg: String = ClassPathResource("persona/animal/little-chick.svg")
    .getContentAsString(Charset.defaultCharset())

val littleChickKotlinSvg: String = ClassPathResource("persona/animal/little-chick-kotlin.svg")
    .getContentAsString(Charset.defaultCharset())

val littleChickJavaSvg: String = ClassPathResource("persona/animal/little-chick-java.svg")
    .getContentAsString(Charset.defaultCharset())

val littleChickJsSvg: String = ClassPathResource("persona/animal/little-chick-js.svg")
    .getContentAsString(Charset.defaultCharset())

val littleChickNodeSvg: String = ClassPathResource("persona/animal/little-chick-node.svg")
    .getContentAsString(Charset.defaultCharset())

val littleChickSwiftSvg: String = ClassPathResource("persona/animal/little-chick-swift.svg")
    .getContentAsString(Charset.defaultCharset())

val littleChickLinuxSvg: String = ClassPathResource("persona/animal/little-chick-linux.svg")
    .getContentAsString(Charset.defaultCharset())

val littleChickSpringSvg: String = ClassPathResource("persona/animal/little-chick-spring.svg")
    .getContentAsString(Charset.defaultCharset())

val penguinSvg: String = ClassPathResource("persona/animal/penguin.svg")
    .getContentAsString(Charset.defaultCharset())

val penguinKotlinSvg: String = ClassPathResource("persona/animal/penguin-kotlin.svg")
    .getContentAsString(Charset.defaultCharset())

val penguinJavaSvg: String = ClassPathResource("persona/animal/penguin-java.svg")
    .getContentAsString(Charset.defaultCharset())

val penguinJsSvg: String = ClassPathResource("persona/animal/penguin-js.svg")
    .getContentAsString(Charset.defaultCharset())

val penguinNodeSvg: String = ClassPathResource("persona/animal/penguin-node.svg")
    .getContentAsString(Charset.defaultCharset())

val penguinSwiftSvg: String = ClassPathResource("persona/animal/penguin-swift.svg")
    .getContentAsString(Charset.defaultCharset())

val penguinLinuxSvg: String = ClassPathResource("persona/animal/penguin-linux.svg")
    .getContentAsString(Charset.defaultCharset())

val penguinSpringSvg: String = ClassPathResource("persona/animal/penguin-spring.svg")
    .getContentAsString(Charset.defaultCharset())

val pigSvg: String = ClassPathResource("persona/animal/pig.svg")
    .getContentAsString(Charset.defaultCharset())

val pigKotlinSvg: String = ClassPathResource("persona/animal/pig-kotlin.svg")
    .getContentAsString(Charset.defaultCharset())

val pigJavaSvg: String = ClassPathResource("persona/animal/pig-java.svg")
    .getContentAsString(Charset.defaultCharset())

val pigJsSvg: String = ClassPathResource("persona/animal/pig-js.svg")
    .getContentAsString(Charset.defaultCharset())

val pigNodeSvg: String = ClassPathResource("persona/animal/pig-node.svg")
    .getContentAsString(Charset.defaultCharset())

val pigSwiftSvg: String = ClassPathResource("persona/animal/pig-swift.svg")
    .getContentAsString(Charset.defaultCharset())

val pigLinuxSvg: String = ClassPathResource("persona/animal/pig-linux.svg")
    .getContentAsString(Charset.defaultCharset())

val pigSpringSvg: String = ClassPathResource("persona/animal/pig-spring.svg")
    .getContentAsString(Charset.defaultCharset())

val slimeRedSvg: String = ClassPathResource("persona/animal/slime-red.svg")
    .getContentAsString(Charset.defaultCharset())

val slimeRedKotlinSvg: String = ClassPathResource("persona/animal/slime-red-kotlin.svg")
    .getContentAsString(Charset.defaultCharset())

val slimeBlueSvg: String = ClassPathResource("persona/animal/slime-blue.svg")
    .getContentAsString(Charset.defaultCharset())

val slimeGreenSvg: String = ClassPathResource("persona/animal/slime-green.svg")
    .getContentAsString(Charset.defaultCharset())

val largeTextSvgs = lazy {
    val map = mutableMapOf<String, String>()
    for (i in 'A'..'Z') {
        val path = "persona/text/large/$i.svg"
        map[i.toString()] = ClassPathResource(path)
            .getContentAsString(Charset.defaultCharset())
    }
    for (i in 'a'..'z') {
        val path = "persona/text/large/$i.svg"
        map[i.toString()] = ClassPathResource(path)
            .getContentAsString(Charset.defaultCharset())
    }
    for (i in 0..9) {
        val path = "persona/text/large/$i.svg"
        map[i.toString()] = ClassPathResource(path)
            .getContentAsString(Charset.defaultCharset())
    }
    map["-"] = ClassPathResource("persona/text/large/hyphens.svg")
        .getContentAsString(Charset.defaultCharset())
    map
}.value

val mediumNumberSvgs = lazy {
    val list = mutableListOf<String>()
    for (i in 0..9) {
        val path = "persona/text/medium/$i.svg"
        list.add(
            ClassPathResource(path)
                .getContentAsString(Charset.defaultCharset())
        )
    }
    list
}.value

val numberSvgs = lazy {
    val list = mutableListOf<String>()
    for (i in 0..9) {
        val path = "persona/text/small/$i.svg"
        list.add(
            ClassPathResource(path)
                .getContentAsString(Charset.defaultCharset())
        )
    }
    list
}.value
