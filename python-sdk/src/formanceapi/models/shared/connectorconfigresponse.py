from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from formanceapi import utils
from typing import Any


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ConnectorConfigResponse:
    data: Any = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    