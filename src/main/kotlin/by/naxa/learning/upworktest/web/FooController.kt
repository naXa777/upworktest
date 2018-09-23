package by.naxa.learning.upworktest.web

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import javax.servlet.http.HttpServletRequest

@Controller
class FooController {

    /**
     * When the view is displayed in the browser, its URL is “http://mydomain/foo?abc=123”.
     * Which of the following statements is true?
     * <br/>
     * Answer: The attribute name-value pair will be included in the URL, regardless of the use of {@link @ModelAttribute} in the controller.
     * <br/>
     * Comment: the original arguments order was causing an error
     *   "An Errors/BindingResult argument is expected to be declared immediately after the model attribute, the @RequestBody or the @RequestPart arguments"
     * Solution: delete `bindResult: BindingResult`
     */
    @GetMapping("/foo")
    fun foo(request: HttpServletRequest, model: ModelMap) : String {
        model.addAttribute("abc", 123)
        return "foo"
    }

}