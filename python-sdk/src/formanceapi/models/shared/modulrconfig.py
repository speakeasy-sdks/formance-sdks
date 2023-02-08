import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class ModulrConfig:
    api_key: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('apiKey') }})
    api_secret: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('apiSecret') }})
    endpoint: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('endpoint') }})
    