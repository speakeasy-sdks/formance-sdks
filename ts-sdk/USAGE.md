<!-- Start SDK Example Usage -->
```typescript
import { FormanceAPI, withSecurity} from "@formance/sdk";
import { GetServerInfoResponse } from "@formance/sdk/src/sdk/models/operations";
import { AxiosError } from "axios";

const sdk = new FormanceAPI(withSecurity(
  security: {
    authorization: {
      authorization: "Bearer YOUR_ACCESS_TOKEN_HERE",
    },
  }
));

sdk.getServerInfo().then((res: GetServerInfoResponse | AxiosError) => {
   // handle response
});
```
<!-- End SDK Example Usage -->