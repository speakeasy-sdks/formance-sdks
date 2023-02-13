<!-- Start SDK Example Usage -->
```java
package hello.world;

import dev.formance.javasdk.FormanceAPI;
import dev.formance.javasdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            FormanceAPI.Builder builder = FormanceAPI.builder();

            builder.setSecurity(
                new Security() {{
                    authorization = new SchemeAuthorization() {{
                        authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                    }};
                }}
            );

            FormanceAPI sdk = builder.build();

            PaymentsgetServerInfoResponse res = sdk.paymentsgetServerInfo();

            if (res.serverInfo.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->