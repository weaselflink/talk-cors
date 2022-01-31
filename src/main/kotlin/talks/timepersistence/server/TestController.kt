package talks.timepersistence.server

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(produces = [MediaType.TEXT_PLAIN_VALUE])
class TestController {

    @GetMapping("/simple")
    fun simpleGet() = "simple get: ok"

    @PostMapping("/simple")
    fun simplePost(@RequestBody request: String?) = "simple post: $request"

    @GetMapping("/strict")
    fun strictGet() = "strict get: ok"

    @PostMapping("/strict")
    fun strictPost(@RequestBody request: String?) = "strict post: $request"
}
