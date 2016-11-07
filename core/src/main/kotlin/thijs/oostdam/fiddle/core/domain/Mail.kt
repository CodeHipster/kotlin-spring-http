package thijs.oostdam.fiddle.core.domain

import thijs.oostdam.fiddle.core.common.EmailAddress

data class Mail(val id: String, val from: EmailAddress, val content: String)

