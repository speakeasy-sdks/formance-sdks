import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class CurrencyCloudConfig:
    api_key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('apiKey') }})
    login_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('loginID') }})
    endpoint: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('endpoint') }})
    polling_period: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('pollingPeriod') }})
    