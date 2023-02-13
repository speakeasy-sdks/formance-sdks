<!-- Start SDK Example Usage -->
```python
import formanceapi
from formanceapi.models import operations, shared

s = formanceapi.FormanceAPI()
s.config_security(
    security=shared.Security(
        authorization=shared.SchemeAuthorization(
            authorization="Bearer YOUR_ACCESS_TOKEN_HERE",
        ),
    )
)
    
res = s.paymentsget_server_info()

if res.server_info is not None:
    # handle response
```
<!-- End SDK Example Usage -->