<!-- Start SDK Example Usage -->
```typescript
import {
  PaymentsgetServerInfoResponse 
} from "@formance/sdk/dist/sdk/models/operations";

import { AxiosError } from "axios";
import { FormanceAPI } from "@formance/sdk";

const sdk = new FormanceAPI({
  security: {
    authorization: {
      authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
    },
  }
});

sdk.paymentsgetServerInfo().then((res: PaymentsgetServerInfoResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->