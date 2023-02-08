import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json
@dataclasses.dataclass
class DummyPayConfig:
    directory: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('directory') }})
    file_generation_period: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('fileGenerationPeriod') }})
    file_polling_period: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('filePollingPeriod') }})
    