import dataclasses
from ..shared import configinfo as shared_configinfo
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class ConfigInfoResponse:
    data: shared_configinfo.ConfigInfo = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    