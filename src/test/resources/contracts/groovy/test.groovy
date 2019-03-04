package groovy

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method('POST')
        headers {
            contentType(applicationJson())
        }
        body(file("request.json"))
        url("/test")
    }
    response {
        status OK()
        body(file("response.json"))
    }
}