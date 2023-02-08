import dataclasses
from ..shared import workflow as shared_workflow
from dataclasses_json import dataclass_json
from formanceapi import utils


@dataclass_json
@dataclasses.dataclass
class CreateWorkflowResponse:
    data: shared_workflow.Workflow = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('data') }})
    