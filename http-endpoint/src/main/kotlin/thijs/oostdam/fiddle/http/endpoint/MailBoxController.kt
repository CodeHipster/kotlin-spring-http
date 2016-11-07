package thijs.oostdam.fiddle.http.endpoint

import org.springframework.web.bind.annotation.*
import thijs.oostdam.fiddle.core.common.EmailAddress
import thijs.oostdam.fiddle.core.domain.Mail
import thijs.oostdam.fiddle.core.domain.MailBox
import thijs.oostdam.fiddle.http.endpoint.dto.RequestMail
import java.util.*

@RestController
@RequestMapping("/mail/{address}")
class MailBoxController{

    @GetMapping("/")
    fun getMailbox(@PathVariable address:EmailAddress): MailBox {
        return MailBox(address)
    }

    @GetMapping("/{id}/")
    fun getEmail(@PathVariable address:EmailAddress, @PathVariable id:String): Mail {
        return Mail(id, EmailAddress("test@test.com"), "Inhoud van de email!")
    }

    @PostMapping("/")
    fun addEmail(@PathVariable address:EmailAddress, @RequestBody email: RequestMail): Mail{
        return Mail(UUID.randomUUID().toString(), email.from, email.content)
    }
}
