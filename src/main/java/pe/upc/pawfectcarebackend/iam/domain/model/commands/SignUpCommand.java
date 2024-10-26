package pe.upc.pawfectcarebackend.iam.domain.model.commands;

import pe.upc.pawfectcarebackend.iam.domain.model.entities.Role;

import java.util.List;

public record SignUpCommand(String username, String password, List<Role> roles) {
}
