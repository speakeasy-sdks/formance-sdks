import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class UpdateClientRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=description" })
  description?: string;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;

  @SpeakeasyMetadata({ data: "json, name=postLogoutRedirectUris" })
  postLogoutRedirectUris?: string[];

  @SpeakeasyMetadata({ data: "json, name=public" })
  public?: boolean;

  @SpeakeasyMetadata({ data: "json, name=redirectUris" })
  redirectUris?: string[];

  @SpeakeasyMetadata({ data: "json, name=trusted" })
  trusted?: boolean;
}