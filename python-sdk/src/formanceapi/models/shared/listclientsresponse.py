from __future__ import annotations
import dataclasses
from ..shared import client as shared_client
from dataclasses_json import Undefined, dataclass_json
from formanceapi import utils
from typing import Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ListClientsResponse:
    data: Optional[list[shared_client.Client]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('data'), 'exclude': lambda f: f is None }})
    