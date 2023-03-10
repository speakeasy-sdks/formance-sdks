import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class SchemeAuthorization extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "security, name=Authorization" })
  authorization: string;
}

export class Security extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "security, scheme=true;type=oauth2" })
  authorization: SchemeAuthorization;
}