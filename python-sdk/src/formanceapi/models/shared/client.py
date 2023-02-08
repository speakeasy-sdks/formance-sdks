import dataclasses
from ..shared import clientsecret as shared_clientsecret
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Any, Optional


@dataclass_json
@dataclasses.dataclass
class Client:
    id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('id') }})
    name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('name') }})
    description: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('description') }})
    metadata: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('metadata') }})
    post_logout_redirect_uris: Optional[list[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('postLogoutRedirectUris') }})
    public: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('public') }})
    redirect_uris: Optional[list[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('redirectUris') }})
    scopes: Optional[list[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('scopes') }})
    secrets: Optional[list[shared_clientsecret.ClientSecret]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('secrets') }})
    trusted: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('trusted') }})
    