<!-- Start SDK Example Usage -->
```go
package main

import (
    "context"
    "log"
    "github.com/speakeasy-sdks/formance-sdks/go-client-sdk"
    "github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/shared"
    "github.com/speakeasy-sdks/formance-sdks/go-client-sdk/pkg/models/operations"
)

func main() {
    opts := []formance.SDKOption{
        formance.WithSecurity(
            shared.Security{
                Authorization: shared.SchemeAuthorization{
                    Authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
                },
            },
        ),
    }

    s := formance.New(opts...)

    ctx := context.Background()
    res, err := s.PaymentsgetServerInfo(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.ServerInfo != nil {
        // handle response
    }
}
```
<!-- End SDK Example Usage -->