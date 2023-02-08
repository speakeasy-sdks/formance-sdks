import dataclasses
from dataclasses_json import dataclass_json
from formanceapi import utils
from typing import Any


@dataclass_json
@dataclasses.dataclass
class ConnectorConfigResponse:
    data: Any = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    