package org.gitanimals.render.app

import org.gitanimals.render.domain.UserService
import org.gitanimals.render.domain.request.PersonaChangeRequest
import org.gitanimals.render.domain.response.PersonaResponse
import org.springframework.stereotype.Service

@Service
class UserFacade(
    private val userService: UserService,
    private val identityApi: IdentityApi,
) {

    fun changePersona(token: String, personChangeRequest: PersonaChangeRequest) {
        val user = identityApi.getUserByToken(token)

        userService.changePersona(user.id.toLong(), personChangeRequest)
    }

    fun addPersona(token: String, idempotencyKey: String, personaType: String): PersonaResponse {
        val user = identityApi.getUserByToken(token)

        return userService.addPersona(user.id.toLong(), personaType, idempotencyKey)
    }

    fun deletePersona(token: String, personaId: Long): PersonaResponse {
        val user = identityApi.getUserByToken(token)

        return userService.deletePersona(user.id.toLong(), personaId)
    }
}
