from __future__ import annotations
import dataclasses
from ..shared import configinfo as shared_configinfo
from dataclasses_json import Undefined, dataclass_json
from formanceapi import utils


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ConfigInfoResponse:
    data: shared_configinfo.ConfigInfo = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    