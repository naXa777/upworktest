package by.naxa.learning.upworktest.web

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import javax.servlet.http.HttpServletRequest

@Controller
class FooController {

    /**
     * When the view is displayed in the browser, its URL is “http://mydomain/foo?abc=123”.
     * Which of the following statements is true?
     * Answer: The attribute name-value pair will be included in the URL, regardless of the use of {@link @ModelAttribute} in the controller.
     */
    @GetMapping("/foo")
    fun foo(request: HttpServletRequest, bindResult: BindingResult, model: ModelMap) : String {
        model.addAttribute("abc", 123)
        return "foo"
    }

}