/*
 * Copyright 2015 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.qa.phaser;

public abstract class PhaseDefinitionProcessor {

	public abstract void execute();

	public ExecutionError handleException(Throwable t) {
		return new ExecutionError(new ExceptionHandling(), t);
	}

	public ExecutionError handleException(ExceptionHandling exceptionHandling, Throwable t) {
		return new ExecutionError(exceptionHandling, t);
	}
}
