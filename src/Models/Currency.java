package Models;

public record Currency(String base_code,
                       String target_code,
                       double conversion_rate,
                       double conversion_result) {
}
