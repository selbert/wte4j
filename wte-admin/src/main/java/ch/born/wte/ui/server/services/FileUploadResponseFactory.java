/**
 * Copyright (C) 2015 Born Informatik AG (www.born.ch)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.born.wte.ui.server.services;

import ch.born.wte.ui.shared.FileUploadResponse;

public interface FileUploadResponseFactory {

	public abstract FileUploadResponse createErrorResponse(MessageKey messageKey);

	public abstract FileUploadResponse createSuccessResponse(
			MessageKey messageKey);

	public abstract String createJsonSuccessResponse(MessageKey templateUploaded);

	public abstract String createJsonErrorResponse(MessageKey messageKey);

}