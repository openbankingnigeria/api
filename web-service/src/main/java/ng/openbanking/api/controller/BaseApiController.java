package ng.openbanking.api.controller;

import org.springframework.beans.factory.annotation.Value;

public abstract class BaseApiController {

    @Value("{obn.api.url.prefix:api}")
    final  static String apiPrefix="/api";
}
