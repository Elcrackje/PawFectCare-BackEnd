package pe.upc.pawfectcarebackend.iam.interfaces.rest.transform;

import pe.upc.pawfectcarebackend.iam.domain.model.aggregates.User;
import pe.upc.pawfectcarebackend.iam.domain.model.entities.Role;
import pe.upc.pawfectcarebackend.iam.interfaces.rest.resources.UserResource;

public class UserResourceFromEntityAssembler {
    public static UserResource toResourceFromEntity(User user) {
        var roles = user.getRoles().stream().map(Role::getStringName).toList();
        return new UserResource(user.getId(), user.getUsername(), roles);
    }
}
