<!-- Start SDK Example Usage -->
```typescript
import { FormanceAPI, withSecurity} from "@formance/sdk";
import { PaymentsgetServerInfoResponse } from "@formance/sdk/src/sdk/models/operations";
import { AxiosError } from "axios";

const sdk = new FormanceAPI(withSecurity(
  security: {
    authorization: {
      authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
    },
  }
));

sdk.paymentsgetServerInfo().then((res: PaymentsgetServerInfoResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->