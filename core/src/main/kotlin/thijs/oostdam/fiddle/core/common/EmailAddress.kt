package thijs.oostdam.fiddle.core.common;

/**
 * Created by Thijs on 7-11-2016.
 */
data class EmailAddress(val email: String) {
    private val emailPattern = Regex("""^\w+@\w+\.\w+""")

    init {
        if(!emailPattern.matches(email)){
            throw InvalidEmailException("$email is nog a valid email")
        }
    }

    class InvalidEmailException(message:String): Throwable(message){
    }
}
